package pl.zazen.dharmagate.documents;

import com.dropbox.core.v2.DbxClientV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DropboxDocumentService implements DocumentService {

    private DbxClientV2 dropboxClient;

    @Autowired
    public DropboxDocumentService(DbxClientV2 dropboxClient) {
        this.dropboxClient = dropboxClient;
    }

    @Override
    public Document getById(String id) {
        return null;
    }
}
