# Problems

## やりたい事

* /names にアクセスし、db のテーブルをjsonで返したい

## 実施したところ出たエラー

* IDE画面

```
java.sql.SQLSyntaxErrorException: Access denied for user 'user'@'%' to database 'goods_list'
```

* POSTMAN

  ![img.png](images/img.png)

* mysqlにてdatabaseの確認をしてもdatabaseに今回createされていてほしい「goods_list」が無い

  ![img_2.png](images/img_2.png)

* 実は、上記実施する前にコードを下図のように誤っており、mysqlでdatabase確認したら別のデータベース（name_list）が表示されるもんで、mysql上でdrop database
  でそのデータベース（name_list）を削除した。

  ![img_3.png](images/img_3.png)

* 001-create-table... 上の「goods」が白色なのは正常ですかね？

  ![img_4.png](images/img_4.png)

## その他状況

* docker ps コマンド時

![img_1.png](images/img_1.png)

* docker containers上 logs

```
2023-01-14 19:12:05 2023-01-14 10:12:05+00:00 [Note] [Entrypoint]: Entrypoint script for MySQL Server 8.0.31-1debian11 started.
2023-01-14 19:12:05 2023-01-14 10:12:05+00:00 [Note] [Entrypoint]: Switching to dedicated user 'mysql'
2023-01-14 19:12:05 2023-01-14 10:12:05+00:00 [Note] [Entrypoint]: Entrypoint script for MySQL Server 8.0.31-1debian11 started.
2023-01-14 19:12:05 2023-01-14T10:12:05.736908Z 0 [Warning] [MY-011068] [Server] The syntax '--skip-host-cache' is deprecated and will be removed in a future release. Please use SET GLOBAL host_cache_size=0 instead.
2023-01-14 19:12:05 2023-01-14T10:12:05.737009Z 0 [Warning] [MY-010918] [Server] 'default_authentication_plugin' is deprecated and will be removed in a future release. Please use authentication_policy instead.
2023-01-14 19:12:05 2023-01-14T10:12:05.737026Z 0 [System] [MY-010116] [Server] /usr/sbin/mysqld (mysqld 8.0.31) starting as process 1
2023-01-14 19:12:05 2023-01-14T10:12:05.743289Z 1 [System] [MY-013576] [InnoDB] InnoDB initialization has started.
2023-01-14 19:12:05 2023-01-14T10:12:05.876391Z 1 [System] [MY-013577] [InnoDB] InnoDB initialization has ended.
2023-01-14 19:12:06 2023-01-14T10:12:06.083378Z 0 [Warning] [MY-010068] [Server] CA certificate ca.pem is self signed.
2023-01-14 19:12:06 2023-01-14T10:12:06.083421Z 0 [System] [MY-013602] [Server] Channel mysql_main configured to support TLS. Encrypted connections are now supported for this channel.
2023-01-14 19:12:06 2023-01-14T10:12:06.086324Z 0 [Warning] [MY-011810] [Server] Insecure configuration for --pid-file: Location '/var/run/mysqld' in the path is accessible to all OS users. Consider choosing a different directory.
2023-01-14 19:12:06 2023-01-14T10:12:06.108279Z 0 [System] [MY-011323] [Server] X Plugin ready for connections. Bind-address: '::' port: 33060, socket: /var/run/mysqld/mysqlx.sock
2023-01-14 19:12:06 2023-01-14T10:12:06.108355Z 0 [System] [MY-010931] [Server] /usr/sbin/mysqld: ready for connections. Version: '8.0.31'  socket: '/var/run/mysqld/mysqld.sock'  port: 3306  MySQL Community Server - GPL.
```

ファイル作成後、何度か別のエラーに出会いながら対処した際に、Docker上でファイルを消したり、dbを消したりしてしまいました。
それが、今回のモノに影響しているかもしれません。
ただ、「Access denied for user 'user'@'%'」あたりで検索するとユーザーのアクセス件的な話になるのですが、
正直第八回課題と同じように書いているのになぜこのエラーが出るのかが分からず。。

なお、spring initializrからやり直したところうまくいき、postmanでリクエストもちゃんと返ってきました。
