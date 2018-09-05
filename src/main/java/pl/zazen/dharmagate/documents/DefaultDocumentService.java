package pl.zazen.dharmagate.documents;

import org.springframework.stereotype.Service;
import org.thymeleaf.util.Validate;
import pl.zazen.dharmagate.documents.Document.Document;
import pl.zazen.dharmagate.documents.Document.DropboxDocumentRepository;
import pl.zazen.dharmagate.documents.DocumentInformation.DocumentInformation;
import pl.zazen.dharmagate.documents.DocumentInformation.DocumentInformationService;

@Service
public class DefaultDocumentService implements DocumentService {

    private DocumentInformationService documentInformationService;
    private DropboxDocumentRepository dropboxDocumentRepository;

    public DefaultDocumentService(DocumentInformationService documentInformationService,
                                  DropboxDocumentRepository dropboxDocumentRepository) {
        this.documentInformationService = documentInformationService;
        this.dropboxDocumentRepository = dropboxDocumentRepository;
    }

    @Override
    public Document getByHash(String hash) {
        Validate.notNull(hash, "id cannot be null");

        final DocumentInformation documentInformation = documentInformationService.getByHash(hash);
        return dropboxDocumentRepository.getByPath(documentInformation.getPathWithName());
    }
}
