package pl.zazen.dharmagate.documents;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "DocumentInformation")
@Builder
@Getter
@ToString
public class DocumentInformation {

    @Id
    private String hash;
    private String path;
    private String name;
    private String tags;
}