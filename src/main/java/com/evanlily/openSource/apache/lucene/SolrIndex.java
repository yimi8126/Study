package com.evanlily.openSource.apache.lucene;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;

/**
 * User: 一米
 * Date: 13-7-29
 * Time: 下午7:42
 * Description:
 */
public class SolrIndex {
    public static void main(String[] args) {
        SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr");
        SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id", 2);
        doc.addField("name", "Solr In34put Document");
        doc.addField("url", "this is SolrInput343434Document content");
        doc.addField("fuck", "this is SolrInput343434Document content");
        try {
            UpdateResponse add = solrServer.add(doc);
            solrServer.commit();
            System.out.println(add.getQTime());
            System.out.println(add.getStatus());
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
