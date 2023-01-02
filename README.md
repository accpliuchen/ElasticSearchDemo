https://www.jianshu.com/p/e00de3bc6acc

1. install elasticsearch

brew install ElasticSearch
after that ./elasticsearch and open your browser

127.0.0.1:9200

and, install Kibana, it will support UI interaction with ElasticSearch.

brew install kibana
./kibana

127.0.0.1:5601

Directory

![image](https://github.com/accpliuchen/ElasticSearchDemo/blob/master/Image/directory.png)

bin: the executable file is inside, the command to run es is inside this, contains some script files, etc.
config: configuration file directory
JDK: java environment
lib: dependent jar, class library
logs: log files
modules: es related modules
plugins: you can develop your own plugins
data: this directory does not have, create a new one yourself, later to use -> mkdir data, this as the index directory


If you would like to setup cluster or nodes
/config/elasticsearch.yml

![image](https://github.com/accpliuchen/ElasticSearchDemo/blob/master/Image/img.png)