package com.mycompany.myapp.domain;

import org.springframework.data.annotation.Id;
import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.IdPrefix;

import java.io.Serializable;
import java.util.Objects;

import static com.mycompany.myapp.config.Constants.ID_DELIMITER;
import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;

/**
 * A Book.
 */
@Document
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String PREFIX = "book";

    @SuppressWarnings("unused")
    @IdPrefix
    private String prefix = PREFIX;

    @Id
    @GeneratedValue(strategy = UNIQUE, delimiter = ID_DELIMITER)
    private String id;

    @Field("title")
    private String title;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Book title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        if (book.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), book.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            "}";
    }
}
