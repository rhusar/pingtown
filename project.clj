(defproject sample-clojure-cloudbees "1.0.0-SNAPSHOT"
  :description "Sample clojure application - clojure 1.3 !"


  ;; Your app id here ! account/appname
  :cloudbees-app-id "michaelvideo/sampleclojure"

  ;; punch in your cloudbees details - don't put your secrets in this file or you will 
  ;; accidentally put them in git !  
  ;; 
  ;; - you can also have these in ~/.bees/bees.config in the form of 
  ;; bees.api.secret=S
  ;; bees.api.key=Y
  ;;:cloudbees-api-key ~(slurp "/Users/michaelneale/michaelvideo-cloudbees.apikey")
  ;;:cloudbees-api-secret ~(slurp "/Users/michaelneale/michaelvideo-cloudbees.secret")

  ;; ring is middleware for clojure
  ;; the compujure web framework is handy (which uses ring)
  :dependencies [[org.clojure/clojure "1.3.0"]
  				       [compojure "1.0.4"]
                 [http.async.client "0.4.5"]
                 [overtone/at-at "1.0.0"]]

  ;; so we can do "lein ring server" (and used by deployment plugin)				
  :dev-dependencies [[lein-ring "0.7.1"]
                     [lein-cloudbees "1.0.2-SNAPSHOT"]]

  ;; the main entry point for our app
  :ring {:handler sample-clojure-cloudbees.core/app}


)


