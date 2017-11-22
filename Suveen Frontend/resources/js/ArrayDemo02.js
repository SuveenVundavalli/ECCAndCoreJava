var fruits = ['Banana', 'Apple', 'Pineapple', 'Orange', 'Kiwi', 'Pears', 'Plums', 'CustardApple'];

window.onload = function () {
    show();
}

function show() {
    var text = "";
    for (var i = 0; i < fruits.length; i++) {
        text += "<option>" + fruits[i] + "</option>";
    }
    var options = document.getElementById("select1");
    options.innerHTML = text;
}


function add() {
    var input = document.getElementById("input1");
    fruits.push(input.value);
    input.value = "";
    show();
}

function sort() {
    fruits.sort();
    show();
}

function search() {
    var input = document.getElementById("input1");
    if (input.value != "") {
        var text = "";
        for (var i = 0; i < fruits.length; i++) {
            if (input.value == fruits[i].substring(0, input.value.length)) {
                text += "<option>" + fruits[i] + "</option>";
            }
        }
    }
    var options = document.getElementById("select1");
    options.innerHTML = text;
}

function deleteItem(){
    var select1 = document.getElementById("select1");
    var list = [];
    for(var i=0;i<fruits.length;i++){
        list[i] = select1[i].selected;
        console.log(select1[i]);
    }
    for(var i=0;i<list.length;i++){
        if(list[i]){
            fruits.splice(i,1);
        }
    }
    show();
}
function deleteAll(){
    fruits = [];
    show();
}
