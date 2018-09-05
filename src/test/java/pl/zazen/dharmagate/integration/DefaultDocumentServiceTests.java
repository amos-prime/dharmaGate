package pl.zazen.dharmagate.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.zazen.dharmagate.documents.DefaultDocumentService;
import pl.zazen.dharmagate.documents.Document.Document;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultDocumentServiceTests {

    @Autowired
    private DefaultDocumentService defaultDocumentService;

    @Test
    public void shouldGetDocumentByHash() {
        //given
        final String DOCUMENT_HASH = "testHash2";
        //TODO: setup mongo DocumentInformation and upload file to dropbox
        //TODO: using DropboxClientHelperSnippets code snippets

        //when
        final Document document = defaultDocumentService.getByHash(DOCUMENT_HASH);

        //then
        assertThat(document, is(notNullValue()));
    }
}

