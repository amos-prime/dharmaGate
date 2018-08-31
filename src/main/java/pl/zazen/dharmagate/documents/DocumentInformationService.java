package pl.zazen.dharmagate.documents;

public interface DocumentInformationService {
    DocumentInformation getByHash(String hash);
}
