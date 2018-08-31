function initCombo(id){
    myCombo = new dhtmlXCombo(id);
    /*
    myCombo.load("../common/data_airports.json", function(){
        // callback
    });*/
    myCombo.addOption("1", "Walking through the city", "color:red;", null, true);
    myCombo.addOption("2", "Looking oh so pretty", "color:green;");
    myCombo.addOption("3", "I've just got to find my way", "color:blue;");
    myCombo.addOption("4", "See the ladies flashing", "color:magenta;");
    myCombo.addOption("5", "All their legs and lashes", "color:darkorange;");
    myCombo.addOption("6", "I've just got to find my way", "color:brown;");
}

function initGrid(){
    myGrid = new dhtmlXGridObject('gridbox');
    myGrid.setImagePath("../../../codebase/imgs/");
    myGrid.setHeader("Column A, Column B");
    myGrid.setInitWidthsP("50,50");
    myGrid.setColAlign("right,left");
    myGrid.setColTypes("ro,ed");
    myGrid.setColSorting("int,str");
    myGrid.enableMultiselect(true);
    myGrid.init();
   // myGrid.load("../common/grid.xml");
}
var myGrid;

$( document ).ready(function() {
    initCombo("combo_zone1");
    initCombo("combo_zone2");
    initCombo("combo_zone3");
    initCombo("combo_zone4");
    initCombo("combo_zone5");
    initCombo("combo_zone6");
    initCombo("combo_zone7");
    initGrid();
});