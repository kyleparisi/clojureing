# LEARNING

[Referecne](http://clojure.org/getting_started)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Downloads](http://clojure.org/downloads)

```shell
wget http://repo1.maven.org/maven2/org/clojure/clojure/1.7.0/clojure-1.7.0.zip
unzip clojure-1.7.0.zip
rm clojure-1.7.0.zip
ln -s clojure-1.7.0/clojure-1.7.0.jar ./clojure
java -cp clojure clojure.main
```
`-cp <class search path of directories and zip/jar files>`

The above will start a REPL.  Try it out with `(+ 1 1)`.  Exit with `ctrl+d` (*nix users).

Or run your command inline with
`java -cp clojure clojure.main -e "(println 1)"`  


## HELLO WORLD

Classic example of printing hello world.

```shell
java -cp clojure clojure.main helloworld.clj
```

## [NEXT](https://github.com/kyleparisi/clojureing/tree/network)

```shell
git checkout network
```


#### CLEANUP

```shell
rm -rf cloj*
```