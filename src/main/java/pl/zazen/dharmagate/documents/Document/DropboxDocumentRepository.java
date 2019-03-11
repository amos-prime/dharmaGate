package pl.zazen.dharmagate.documents.Document;

import com.dropbox.core.DbxDownloader;
import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.thymeleaf.util.Validate;

@Repository
@AllArgsConstructor
public class DropboxDocumentRepository implements DocumentRepository {

    private DbxClientV2 dropboxClient;

    @Override
    public Document getByPath(String path) {
        Validate.notNull(path, "path cannot be null");

        try {
            final DbxDownloader<FileMetadata> download = dropboxClient.files().download(path);
            return DropboxDocument.fromInputStream(download.getInputStream());
        } catch (DbxException e) {
            e.printStackTrace();
        }

        return Document.empty();
    }
}
