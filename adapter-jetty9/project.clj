(def jetty-version "9.4.8.v20171121")

(defproject lein-servlet/adapter-jetty9 "0.4.1"
  :description "Jetty 9 adapter for lein-servlet"
  :url "https://github.com/kumarshantanu/lein-servlet"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[org.eclipse.jetty/jetty-server  ~jetty-version]
                 [org.eclipse.jetty/jetty-servlet ~jetty-version]
                 [org.eclipse.jetty/jetty-webapp  ~jetty-version]
                 [org.eclipse.jetty/jetty-http    ~jetty-version]
                 [org.eclipse.jetty/jetty-jndi    ~jetty-version]])
