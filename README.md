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
[root@node01 elasticsearch-7.11.0]# ll /export/servers/elasticsearch-7.11.0
总用量 556
drwxr-xr-x.  2 esuser esuser   4096 2月   9 06:48 bin
drwxr-xr-x.  3 esuser esuser    199 2月  13 14:44 config
drwxr-xr-x.  3 esuser esuser     19 2月  13 14:15 data
drwxr-xr-x.  9 esuser esuser    107 2月   9 06:48 jdk
drwxr-xr-x.  3 esuser esuser   4096 2月   9 06:48 lib
-rw-r--r--.  1 esuser esuser   3860 2月   9 06:41 LICENSE.txt
drwxr-xr-x.  2 esuser esuser      6 2月  13 14:47 logs
drwxr-xr-x. 57 esuser esuser   4096 2月   9 06:49 modules
-rw-r--r--.  1 esuser esuser 544318 2月   9 06:46 NOTICE.txt
drwxr-xr-x.  2 esuser esuser      6 2月   9 06:45 plugins
-rw-r--r--.  1 esuser esuser   7263 2月   9 06:41 README.asciidoc

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

![alt text](https://github.com/accpliuchen/ElasticSearchDemo/blob/master/Image/img.png)