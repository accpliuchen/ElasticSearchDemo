package com.test;


import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.mapper.ObjectMapper;

import java.io.IOException;

public class Test
{


        public static void main(String args[]){
          try{
              //Low Level Client init
              RestClient lowLevelRestClient = RestClient.builder(
                      new HttpHost("localhost", 9200, "http")).build();
              //High Level Client init
              RestHighLevelClient client =
                      new RestHighLevelClient(lowLevelRestClient);

              IndexRequest request = new IndexRequest(
                      "posts", //index name
                      "doc",  // type
                      "1");   // doc id
              String jsonString = "{" +
                      "\"user\":\"kimchy\"," +
                      "\"postDate\":\"2013-01-30\"," +
                      "\"message\":\"trying out Elasticsearch\"" +
                      "}";
              request.source(jsonString, XContentType.JSON);

              IndexResponse indexResponse = client.index(request);

              lowLevelRestClient.close();
          }catch(Exception e){
              e.printStackTrace();
          }
        }
}