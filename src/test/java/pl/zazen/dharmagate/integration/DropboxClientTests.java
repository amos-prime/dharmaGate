package pl.zazen.dharmagate.integration;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.ListFolderResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DropboxClientTests {

    @Autowired
    private DbxClientV2 dbxClient;

    @Test
    public void dbxClientBean_ShouldBeInstantiated() {
        try{
            assertThat(dbxClient.users().getCurrentAccount().getCountry()).isEqualTo("PL");
        }catch (DbxException e){
            e.getMessage();
        }

        //assertThat(dbxClient).isNotNull();

    }

    @Test
    public void dbxClient_shouldReturnListOfFiles() throws DbxException {
        // Get files and folder metadata from Dropbox root directory
        ListFolderResult result = dbxClient.files().listFolder("");
        result.getEntries().forEach(e -> System.out.println("Resource: " + e.getName()));
    }
}

