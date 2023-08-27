package main;

import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;

@RestController
public class Api {
    @RequestMapping(value = "/api/hero", method = RequestMethod.GET)
    String getHero(){
        String json = new JSONObject().put("hero",new JSONObject()
                                            .put("id",1)
                                            .put("name","Pudge")
                                            .put("lvl",1))
                                            .toString();
        return json;
    }
    @RequestMapping(value = "/api/hero", method = RequestMethod.POST)
    Hero modifyHero(@RequestBody Hero hero){
        hero.setId(100);
        System.out.println(validate(hero));
        return hero;
    }
    @RequestMapping("/api/hero/{id}")
    String getHeroById(@PathVariable int id){
        return "Запрошенный номер:" + id;
    }
    private String validate(Hero hero){
        String msgErr = "";
        if (hero.getName().length() < 4
                || hero.getName().length() > 14)
            msgErr += "Некорректная длина имени героя\n";
        if(hero.getLevel() < 0
                || hero.getLevel() > 30)
            msgErr += "Некорректный уровень героя\n";
        return msgErr;
    }
}
