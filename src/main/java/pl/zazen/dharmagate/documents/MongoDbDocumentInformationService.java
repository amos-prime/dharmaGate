package pl.zazen.dharmagate.documents;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MongoDbDocumentInformationService implements DocumentInformationService {

    private DocumentInformationRepository documentInformationRepository;

    @Override
    public DocumentInformation getByHash(String hash) {
        return documentInformationRepository.getByHash(hash);
    }
}
