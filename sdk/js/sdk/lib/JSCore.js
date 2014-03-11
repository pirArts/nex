/**
 * （c）ParArts
 * Created by ericqiu on 3/9/14.
 */

var JSCore = {
    version : 1.0,
    $import : function(importFile){
        "use strict";
        var file = importFile.toString();
        var isRelativePath = (file.indexOf("$") == 0 || file.indexOf("/")==-1);

        // parse the real path
        var path = file;
        if(isRelativePath){
            if(file.indexOf("$")){
                file = file.substr(1);
            }
            path = this.$dir() + file;
        }

        var newElement = null;
        var ext = path.substr(path.lastIndexOf(".") + 1);
        if(ext.toLocaleLowerCase()=="js"){
            var scriptTags = document.getElementsByTagName("script");

            // no multiple import
            for(var i=0; i<scriptTags.length; i++){
                if(scriptTags[i].src && scriptTags[i].src.indexOf(path) != -1){
                    return;
                }
            }

            // set new element
            newElement = document.createElement("script");
            newElement.type = "text/javascript";
            newElement.src = path;

            // append
            document.getElementsByTagName("head")[0].appendChild(newElement);

        }else{
            return;
        }

    },

    $dir : function(){
        "use strict";
        var scriptTags = document.getElementsByTagName("script");
        for(var i=0; i<scriptTags.length; i++){
            if(scriptTags[i].src && scriptTags[i].src.match(/\/lib\/JSCore\.js$/)){
                var path = scriptTags[i].src.replace(/\/lib\/JSCore\.js/, "");
                return path;
            }
        }

        return "";
    }
}

JSCore.$import("../sdk/http/HttpClient.js");
JSCore.$import("../sdk/dispatcher/Dispatcher.js");