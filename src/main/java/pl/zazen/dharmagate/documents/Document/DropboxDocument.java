package pl.zazen.dharmagate.documents.Document;

import java.io.InputStream;

public class DropboxDocument implements Document {

    private InputStream inputStream;

    private DropboxDocument() {}

    public static DropboxDocument fromInputStream(InputStream inputStream) {
        DropboxDocument dropboxDocument = new DropboxDocument();
        dropboxDocument.inputStream = inputStream;
        return dropboxDocument;
    }
}
