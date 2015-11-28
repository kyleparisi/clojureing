# LEARNING

Reference: [http://clojure.org/getting_started](http://clojure.org/getting_started)

```shell
wget http://repo1.maven.org/maven2/org/clojure/clojure/1.7.0/clojure-1.7.0.zip
unzip clojure-1.7.0.zip
rm clojure-1.7.0.zip
ln -s clojure-1.7.0/clojure-1.7.0.jar ./clojure
java -cp clojure clojure.main
```
`-cp <class search path of directories and zip/jar files>`

The above will start a REPL.  Try it out with `(+ 1 1)`.  Exit with `ctrl+d` (*nix users).  


## HELLO WORLD

Classic example of printing hello world.

```shell
java -cp clojure clojure.main helloworld.clj
```

## NETWORK REQUEST - RANDOM WORD



### CLEANUP

```shell
rm -rf cloj*
```