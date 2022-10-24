var alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
var criptato = "JZXTRSEHCYDBGIFKVUMANWQPLO";
var risultato = "";
function converti(s) {
    console.log("parola inserita: " + s);
    for (var i = 0; i < s.length; i++) {
        var carattere = s.charAt(i);
        var indice = alfabeto.indexOf(carattere.toUpperCase());
        risultato += criptato.charAt(indice);
    }
    return risultato;
}
converti("ciao");
console.log("criptaggio parola ....");
console.log("criptaggio completato: " + risultato);
