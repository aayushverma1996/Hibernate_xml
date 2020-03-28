import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

    public class add {

        public static void main(String[] args) {
            //method -1
            //StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            //Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
            //SessionFactory factory = meta.getSessionFactoryBuilder().build();

            data_operations d = new data_operations();
            d.generate_data();
            d.print_data();
            d.update_data_byname("user1110","user101");
            d.delete_byname("user101");
        }
    }

