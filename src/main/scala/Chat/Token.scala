package Chat

enum Token:
  case // Terms
       // TODO - Part 2 Step 1
       BONJOUR, 
       JE,
       SVP,
       ASSOIFFE,
       AFFAME,
       // Actions
       ETRE,
       VOULOIR,
       // Logic Operators
       ET,
       OU,
       // Products
       PRODUIT,
       // Util
       PSEUDO,
       NUM,
       EOL,
       // Use UNKNOWN if there is no match with any other tokens or words
       UNKNOWN
end Token
