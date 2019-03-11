package pl.zazen.dharmagate.documents.Document;

import lombok.AllArgsConstructor;
import java.io.InputStream;

@AllArgsConstructor
public class DropboxDocument implements Document {

    private InputStream inputStream;

    public static DropboxDocument fromInputStream(InputStream inputStream) {
        return new DropboxDocument(inputStream);
    }
}
