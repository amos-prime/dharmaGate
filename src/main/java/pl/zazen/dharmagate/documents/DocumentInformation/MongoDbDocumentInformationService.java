package pl.zazen.dharmagate.documents.DocumentInformation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MongoDbDocumentInformationService implements DocumentInformationService {

    private DocumentInformationRepository documentInformationRepository;

    @Override
    public DocumentInformation getByHash(String hash) {
        return documentInformationRepository.getByHash(hash);
    }
}
