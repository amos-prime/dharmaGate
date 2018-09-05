package pl.zazen.dharmagate.documents.DocumentInformation;

public interface DocumentInformationService {
    DocumentInformation getByHash(String hash);
}
