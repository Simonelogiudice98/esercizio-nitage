
 
 let alfabeto:string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 let criptato:string = "JZXTRSEHCYDBGIFKVUMANWQPLO";
 let risultato:string = "";

 function converti(s:string){
    console.log("parola inserita: " + s);
    
    for(let i= 0; i < s.length; i++){

        let carattere:string = s.charAt(i);
        

        let indice:number = alfabeto.indexOf(carattere.toUpperCase());
        
        risultato += criptato.charAt(indice);
        
        
    }
    return risultato;
 }

 converti("ciao");
 console.log("criptaggio parola ....");
 console.log("criptaggio completato: " + risultato);
 
 