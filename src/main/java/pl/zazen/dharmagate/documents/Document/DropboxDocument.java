package pl.zazen.dharmagate.documents.Document;

import lombok.NoArgsConstructor;

import java.io.InputStream;

@NoArgsConstructor
public class DropboxDocument implements Document {

    private InputStream inputStream;

    //private DropboxDocument() {}

    public static DropboxDocument fromInputStream(InputStream inputStream) {
        DropboxDocument dropboxDocument = new DropboxDocument();
        dropboxDocument.inputStream = inputStream;
        return dropboxDocument;
    }

}
