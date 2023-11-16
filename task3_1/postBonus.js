var express = require('express');
var bodyParser = require('body-parser');
var app = express();
app.use( bodyParser.json() );

var port = 8081;

app.post('/setBonus', function(req, res) {
    console.log('receiving data ...');
    console.log('body is ',req.body);
    res.send(req.body);
});

// start the server
app.listen(port);
console.log('Server started! At http://localhost:' + port);