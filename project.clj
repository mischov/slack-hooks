(defproject slack-proxy "0.1.0-SNAPSHOT"
  :description "Relay webhooks to Slack webhooks"
  :url "https://github.com/lmarburger/slack-proxy"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-jetty-adapter "1.1.6"]
                 [org.clojure/data.json "0.2.4"]
                 [ring/ring-json "0.2.0"]
                 [clj-http "0.7.8"]
                 [clojurewerkz/urly "1.0.0"]]
  :uberjar-name "slack-hooks-standalone.jar"
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler slack-hooks.routes/app}
  :min-lein-version "2.0.0")
