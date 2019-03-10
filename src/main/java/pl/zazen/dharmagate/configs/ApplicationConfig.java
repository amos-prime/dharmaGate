package pl.zazen.dharmagate.configs;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.users.FullAccount;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({
        "classpath:application.properties",
        "classpath:secret.properties"
})
public class ApplicationConfig {

    @Value("${dev.dropbox.api.access.token}")
    private String ACCESS_TOKEN;

    @Bean
    @Profile("dev")
    public DbxClientV2 dropboxClient() {
        DbxRequestConfig config = new DbxRequestConfig("dharmaGate/1.0");
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        try {
            FullAccount account = client.users().getCurrentAccount();
            System.out.println(account.getName().getDisplayName());
        } catch (DbxException e) {
            e.printStackTrace();
        }

        return client;
    }
}