package pl.zazen.dharmagate.documents;

import pl.zazen.dharmagate.documents.Document.Document;

public interface DocumentService {

    Document getByHash(String hash);
}
