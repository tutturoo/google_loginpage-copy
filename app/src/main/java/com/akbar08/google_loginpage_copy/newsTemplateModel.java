package com.akbar08.google_loginpage_copy;

public class newsTemplateModel {
    String header;

    public String getHeader() {
        return header;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getDateUploaded() {
        return dateUploaded;
    }

    String publisherName;
    String dateUploaded;
//    int publisherIcon;
//    int thumbnailIcon;

    public newsTemplateModel(String header, String publisherName, String dateUploaded) {
        this.header = header;
        this.publisherName = publisherName;
        this.dateUploaded = dateUploaded;
//        this.publisherIcon = publisherIcon;
//        this.thumbnailIcon = thumbnailIcon;
    }
}
