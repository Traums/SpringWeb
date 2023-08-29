package task;

import main.domain.Hero;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate {
    Session session;
    Hibernate(){
        try {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure("application.yaml").build();
            Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
            SessionFactory factory = meta.getSessionFactoryBuilder().build();
            this.session = factory.openSession();
        } catch (HibernateException e) {
            System.out.println("Ошибка инициализации класса Hibernate");
        }

    }
    public Hero getRecord(int id){
        return this.session.get(Hero.class,id);
    }
    public void close(){
        this.session.close();
    }
}
