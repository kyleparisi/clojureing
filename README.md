# LEARNING

Clojure is based around projects and package managers.  Let's work with leiningen.  Please have a look at project.clj and the `src/` directory.

```shell
brew install lein
# reinstall clojure with lein
rm -rf cloju*
# 1 option
lein repl
helloworld.core=> (-main)
helloworld.core=> (ns user)
user=> (load-file "helloworld.clj")
user=> (ns helloworld.core)
helloworld.core=> (quit)
# 2 option (because :main is defined)
lein run
```

Start up time for any of this is pretty terrible on my macbook air.  I'm not sure how excited I am about this opinionated 'project' scheme either.  Dependencies are installed in `~/.m2/repository/`.  These are downloaded from  [clojars](https://clojars.org/repo/) or [maven](http://search.maven.org/).