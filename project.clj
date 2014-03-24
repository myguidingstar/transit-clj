(defproject transit-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.fasterxml.jackson.core/jackson-core "2.3.1"]
                 [org.msgpack/msgpack "0.6.9"]
                 [org.clojure/data.fressian "0.2.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [commons-codec 1.5]]
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :dev {:dependencies [[org.clojure/data.generators "0.1.2"]]}})


