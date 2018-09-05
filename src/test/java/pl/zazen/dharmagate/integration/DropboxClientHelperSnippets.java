package pl.zazen.dharmagate.integration;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.zazen.dharmagate.documents.Document.Document;
import pl.zazen.dharmagate.documents.Document.DropboxDocumentRepository;
import pl.zazen.dharmagate.documents.DocumentInformation.DocumentInformation;
import pl.zazen.dharmagate.documents.DocumentInformation.DocumentInformationRepository;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DropboxClientHelperSnippets {

    @Autowired
    private DbxClientV2 dbxClient;

    @Autowired
    private DropboxDocumentRepository dropboxDocumentRepository;

    @Autowired
    private DocumentInformationRepository documentInformationRepository;

    @Test
    public void dbxClientBean_ShouldBeInstantiated() {
        assertThat(dbxClient).isNotNull();
    }

    @Test
    public void helper_uploadTestFile() throws DbxException, IOException {
        byte[] bytes = {'t', 'e', 's', 't'};
        InputStream is = new ByteArrayInputStream(bytes);

        dbxClient.files().uploadBuilder("/test.txt").uploadAndFinish(is);
    }

    @Test
    public void helper_saveTestFileInformation() {
        documentInformationRepository.save(DocumentInformation.builder()
        .hash("testHash2")
        .name("test.txt")
        .path("")
        .tags("#TEST")
        .build());
    }


/*    @Test
    public void helper_getDocument() {
        final String documentName = "/test.txt";

        final Document document = dropboxDocumentRepository.getByPath(documentName);

        System.out.println(document);
    }*/


}

