package pl.zazen.dharmagate.documents.DocumentInformation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocumentInformationRepository extends MongoRepository<DocumentInformation, String> {

    DocumentInformation getByHash(String hash);
}
