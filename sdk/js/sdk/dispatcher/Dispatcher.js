/**
 * （c）ParArts
 * Created by ericqiu on 3/9/14.
 */


JSCore.$import("../sdk/http/HttpClient.js");

var Dispatcher = function(){

    // member
    this.name = "Nex SDK Dispatcher";
    this.httpCilent = new HttpClient();

    // public api
    this.login = function(){
        "use strict";

    }

    this.share = function(){
        "use strict";

    }

    this.ping = function(){
        "use strict";
        var url = "http://localhost:8080/servlet/user/getUser?id=1&key=c4ca4238a0b923820dcc509a6f75849b";
        var url2 = "http://www.baidu.com";
        // this.httpCilent.sendGetRequest(url)
        return this.httpCilent.sendGetRequest(url);
    }

};

// alert(new Dispatcher().name);
alert(new Dispatcher().ping());