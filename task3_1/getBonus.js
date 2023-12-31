import {connectGetCollectionFromDB} from '../mongoDB'
const express = require('express');
const app = express();
app.get( '/getbonus/:id' , (req , res) => {
    const id = req.params.id;
    console.log("The submitted ID is: " + id );
    getBonus(id).then( bonus => res.send( "{\"id\" : " + id + ", \"Bonus\": \""+bonus+" Euro\"}" ))});
app.listen(8080 , () => { console.log("Server läuft!");
});
async function getBonus(id){
    const salesmen = await connectGetCollectionFromDB("db_task1","salesmen",id);
    return salesmen.toString();
}