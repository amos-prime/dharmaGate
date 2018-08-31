package pl.zazen.dharmagate.documents;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocumentInformationRepository extends MongoRepository<DocumentInformation, String> {

    DocumentInformation getByHash(String hash);
}
