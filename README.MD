# Générateur de code Selenium avec XTend et XText
Extension: `.sscript`
## Équipe
- Mathis Planchet
- Louan Bélicaud
## Jeu de test
Exemple de fichier `tests.sscript`:
```
test test1:
    goto "http://www.imt-atlantique.fr/fr"
    assert "a" has text "Toutes les actualités"
test test2:
    goto "http://www.imt-atlantique.fr/fr"
    click "a" with text "Toutes les actualités"
    assert "a" has text "Accueil"
test test3:
    goto "http://www.imt-atlantique.fr/fr"
    click "a" with text "Toutes les actualités"
    click "img" with alt "Accueil"
    assert "a" has text "Toutes les actualités"
test test4:
    goto "http://www.imt-atlantique.fr/rechercher"
    write "Donald Trump" in last "input" with label "Rechercher"
    click "input" with value "Appliquer les filtres"
    assert "body" has text "Aucun résultat ne correspond à votre recherche"
test test5:
    goto "http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation"
    uncheck_all
    check "Anglais"
    check "A domicile"
    check "Temps plein"
    click "input" with value "Appliquer les critères"
    assert "p" has text "No found course matching your criteria."
test test6:
    goto "http://www.imt-atlantique.fr/fr/rechercher"
    write "2006" in last "input" with label "Rechercher"
    select "Le mois dernier" of "div" with id "recherche-date-range"
    click "input" with value "Appliquer les filtres"
    assert "body" has text "Aucun résultat ne correspond à votre recherche"
test test7:
    goto "http://www.imt-atlantique.fr/fr"
    let newsTitle as text of first "h3" with class "field-content"
    click first "a" with text newsTitle
    assert "h1" has text newsTitle
test test8:
    goto "http://www.imt-atlantique.fr/fr"
    let newsTitle as text of "h3" with class "field-content" at 1
    let newsUrl as href of "a" with text newsTitle
    goto "http://www.imt-atlantique.fr/fr/rechercher"
    write newsTitle in last "input" with label "Rechercher"
    click "input" with value "Appliquer les filtres"
    assert "a" has href newsUrl
```