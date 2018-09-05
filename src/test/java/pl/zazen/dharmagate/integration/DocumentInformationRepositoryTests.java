package pl.zazen.dharmagate.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.zazen.dharmagate.documents.DocumentInformation.DocumentInformation;
import pl.zazen.dharmagate.documents.DocumentInformation.DocumentInformationRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DocumentInformationRepositoryTests {

    public static final String HASH = "hash";
    public static final String NAME = "name";
    public static final String PATH = "path";
    public static final String TAGS = "tag";

    @Autowired
    private DocumentInformationRepository documentInformationRepository;

    @Test
    public void shouldSaveDocument() {
        //given
        DocumentInformation documentInformation = DocumentInformation
                .builder()
                .hash(HASH)
                .name(NAME)
                .path(PATH)
                .tags(TAGS)
                .build();

        //when
        DocumentInformation savedDocumentInformation = documentInformationRepository.save(documentInformation);

        //then
        System.out.println(savedDocumentInformation);
    }
}

