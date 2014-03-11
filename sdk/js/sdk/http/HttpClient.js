/**
 * （c）ParArts
 * Created by ericqiu on 3/9/14.
 */


var HttpClient = function(){
    "use strict";

    // Result xml
    this.resultMessage = "";


    this.createHttpRequestClient = function(){
        var client = new XMLHttpRequest();
        if("withCredentials" in client){
            return client;
        } else if(typeof XDomainRequest != "undefined") {
            client = new XDomainRequest();
        } else {
            client = null;
        }

        return client;
    }

    // XML http client
    this.xmlHttp = this.createHttpRequestClient();
    this.xmlHttp.onreadystatechange = function(){
        if(this.xmlHttp.readyState && this.xmlHttp.status){
            this.resultMessage = this.xmlHttp.responseText;
            alert(this.resultMessage);
        }
    }

    // Send get request
    this.sendGetRequest = function(url){
        this.xmlHttp.open("GET", url, false);
        this.setHeaders();
        try{
            this.xmlHttp.send(null);
        }catch(err){
            resXml = "Error" + err.name;
            return resXml;
        }

        var resXml = "";
        if(this.xmlHttp.status == 200){
            resXml = this.xmlHttp.responseText;
        }

        return resXml;
    }

    // keep common headers here
    this.setHeaders = function(){
        // this.xmlHttp.setRequestHeader("Host", "");
        // this.xmlHttp.setRequestHeader("User-Agent", "Mozilla/5.0");
        // this.xmlHttp.setRequestHeader("Accept", "test/html");
        // this.xmlHttp.setRequestHeader("Accept-Encoding", "gzip, deflate");
        this.xmlHttp.setRequestHeader("Request-Id", "eric");
    }

}