<input id="one" value="10">
<input id="two" value="20">
<button onclick="add()">Add</button>
<p id="output">Result</p>
<script>
    var a=document.getElementById("one");
    var b=document.getElementById("two");
    var o=document.getElementById("output")
    function add()
    {
        var c=Number(a.value);
        var d=Number(b.value);
        var e=c+d;
        o.textContent=e;

    }
</script>
