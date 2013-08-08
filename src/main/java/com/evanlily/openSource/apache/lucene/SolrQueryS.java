package com.evanlily.openSource.apache.lucene;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.SolrParams;

/**
 * User: 一米
 * Date: 13-7-29
 * Time: 下午7:42
 * Description:
 */
public class SolrQueryS {
    public static void main(String[] args) {
        try {
            SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr");
            SolrParams params = new SolrQuery("id:2");
            QueryResponse response = solrServer.query(params);
            SolrDocumentList results = response.getResults();
            for (SolrDocument result : results) {
                System.out.println(result.getFieldValue("fuck"));
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
    }
}
