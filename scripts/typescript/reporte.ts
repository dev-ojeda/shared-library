function reporte () {let html="<table id='principal'>";html+="<tr>";html+="<th>Company</th>";html+="<th>Contact</th>";html+="<th>Country</th>";html+="</tr>";html+="<tr>";html+="<td>Alfreds Futterkiste</td>";html+="<td>Maria Anders</td>";html+="<td>Germany</td>";html+="</tr>";html+="<tr>";html+="<td>Centro comercial Moctezuma</td>";html+="<td>Francisco Chang</td>";html+="<td>Mexico</td>";html+="</tr>";html+="</table>";return html;}document.body.innerHTML = reporte();
