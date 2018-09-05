package pl.zazen.dharmagate.documents.Document;

public interface Document {

    Document EMPTY_DOCUMENT = new Document() {
        @Override
        public String toString() {
            return "This document is empty";
        }
    };

    static Document empty() {
        return EMPTY_DOCUMENT;
    }
}
