package org.projectx.rssreader.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class ExceptionResponse {
    private Date dateStamp;

    private String message;

    private String details;
}
