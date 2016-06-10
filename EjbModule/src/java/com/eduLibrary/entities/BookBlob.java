/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.entities;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rocardho
 */
@Entity
@Table(name = "book_blob")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookBlob.findAll", query = "SELECT b FROM BookBlob b"),
    @NamedQuery(name = "BookBlob.findById", query = "SELECT b FROM BookBlob b WHERE b.id = :id"),
    @NamedQuery(name = "BookBlob.findByName", query = "SELECT b FROM BookBlob b WHERE b.name = :name"),
    @NamedQuery(name = "BookBlob.findByXml", query = "SELECT b FROM BookBlob b WHERE b.xml = :xml")})
public class BookBlob implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private byte[] image;

    private String xml;
    private Publisher publisher;

    public BookBlob() {
    }

    public BookBlob(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "image")
    @Lob
    @Basic(fetch = FetchType.EAGER)
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Column(name = "xml")
    @Lob
    @Basic(fetch = FetchType.EAGER)
    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "name",
                column = @Column(name = "PUBLISHER")),
        @AttributeOverride(name = "address",
                column = @Column(name = "PUBLISHER_ADDRESS"))
    })
    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookBlob)) {
            return false;
        }
        BookBlob other = (BookBlob) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eduLibrary.entities.BookBlob[ id=" + id + " ]";
    }

}
