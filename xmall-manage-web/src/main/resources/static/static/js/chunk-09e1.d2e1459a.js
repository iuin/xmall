(window.webpackJsonp=window.webpackJsonp||[]).push([["chunk-09e1"],{"N/F5":function(t,a,e){"use strict";var n=e("t3Un");a.a={getCatalog1:function(){return Object(n.a)({url:"getCatalog1",method:"post"})},getCatalog2:function(t){return Object(n.a)({url:"getCatalog2?catalog1Id="+t,method:"post"})},getCatalog3:function(t){return Object(n.a)({url:"getCatalog3?catalog2Id="+t,method:"post"})},getAttrInfoList:function(t){return Object(n.a)({url:"attrInfoList?catalog3Id="+t,method:"get"})},getAttrValueList:function(t){return Object(n.a)({url:"getAttrValueList?attrId="+t,method:"post"})},saveAttrInfo:function(t){return Object(n.a)({url:"saveAttrInfo",method:"post",data:t})}}},Zl38:function(t,a,e){"use strict";e.r(a);var n=e("N/F5"),o={components:{CatalogSelector:e("awwK").a},data:function(){return{catalogId:null,attrInfoList:null,attrInfoListLoading:!1,showAttrInfoForm:!1,attrValueListLoading:!1,attrInfoForm:{id:null,attrName:null,catalog3Id:null,attrValueList:[]}}},methods:{getAttrInfoList:function(t){var a=this;this.catalogId=t,this.attrInfoListLoading=!0,n.a.getAttrInfoList(this.catalogId).then(function(t){a.attrInfoList=t.data,a.attrInfoListLoading=!1})},addAttrInfo:function(){this.confirmSelect()&&(this.attrInfoForm.id=null,this.attrInfoForm.attrName=null,this.attrInfoForm.attrValueList=[],this.showAttrInfoForm=!0)},confirmSelect:function(){return!!this.catalogId||(this.$alert("请选择三级分类","提示",{confirmButtonText:"确定",type:"warning"}),!1)},editAttrInfoById:function(t,a){var e=this;this.attrValueListLoading=!0,n.a.getAttrValueList(t).then(function(n){e.attrInfoForm.id=t,e.attrInfoForm.attrName=a,e.attrInfoForm.attrValueList=n.data,e.attrValueListLoading=!1}),this.showAttrInfoForm=!0},deleteAttrValueByName:function(t){var a=[];this.attrInfoForm.attrValueList.forEach(function(e){e.valueName!==t&&a.push(e)}),this.attrInfoForm.attrValueList=a},saveAttrInfo:function(){var t=this;this.attrInfoForm.catalog3Id=this.catalogId,n.a.saveAttrInfo(this.attrInfoForm).then(function(a){t.getAttrInfoList(t.catalogId),t.showAttrInfoForm=!1})},backToAttrList:function(){this.showAttrInfoForm=!1},addAttrValue:function(){this.attrInfoForm.attrValueList.push({valueName:null,edit:!0})},saveAttrValue:function(t){t.edit=!1},editAttrValue:function(t){t.edit=!0}}},l=(e("f31X"),e("KHd+")),i=Object(l.a)(o,function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",{staticClass:"app-container"},[e("CatalogSelector",{on:{listenOnSelect:t.getAttrInfoList}}),t._v(" "),e("div",{directives:[{name:"show",rawName:"v-show",value:!t.showAttrInfoForm,expression:"!showAttrInfoForm"}]},[e("div",{staticStyle:{"margin-bottom":"10px"}},[e("el-button",{attrs:{type:"primary",icon:"el-icon-plus",size:"mini"},on:{click:function(a){t.addAttrInfo()}}},[t._v("添加平台属性")])],1),t._v(" "),e("el-table",{directives:[{name:"loading",rawName:"v-loading",value:t.attrInfoListLoading,expression:"attrInfoListLoading"}],attrs:{data:t.attrInfoList,"element-loading-text":"数据正在加载......",border:"",fit:"","highlight-current-row":""}},[e("el-table-column",{attrs:{align:"center",label:"序号",width:"100"},scopedSlots:t._u([{key:"default",fn:function(a){return[t._v("\n          "+t._s(a.$index+1)+"\n        ")]}}])}),t._v(" "),e("el-table-column",{attrs:{label:"属性id",width:"100"},scopedSlots:t._u([{key:"default",fn:function(a){return[t._v("\n          "+t._s(a.row.id)+"\n        ")]}}])}),t._v(" "),e("el-table-column",{attrs:{label:"属性名称"},scopedSlots:t._u([{key:"default",fn:function(a){return[e("span",[t._v(t._s(a.row.attrName))])]}}])}),t._v(" "),e("el-table-column",{attrs:{label:"操作",width:"200",align:"center"},scopedSlots:t._u([{key:"default",fn:function(a){return[e("el-button",{attrs:{type:"primary",size:"mini",icon:"el-icon-edit"},on:{click:function(e){t.editAttrInfoById(a.row.id,a.row.attrName)}}},[t._v("修改")])]}}])})],1)],1),t._v(" "),e("el-form",{directives:[{name:"show",rawName:"v-show",value:t.showAttrInfoForm,expression:"showAttrInfoForm"}],staticClass:"demo-form-inline",attrs:{model:t.attrInfoForm,inline:!0}},[e("el-form-item",{attrs:{label:"属性名称"}},[e("el-input",{model:{value:t.attrInfoForm.attrName,callback:function(a){t.$set(t.attrInfoForm,"attrName",a)},expression:"attrInfoForm.attrName"}})],1),t._v(" "),e("div",{staticStyle:{"margin-bottom":"10px"}},[e("el-button",{attrs:{type:"primary",icon:"el-icon-plus",size:"mini"},on:{click:function(a){t.addAttrValue()}}},[t._v("添加属性值")])],1),t._v(" "),e("div",[e("el-table",{directives:[{name:"loading",rawName:"v-loading",value:t.attrValueListLoading,expression:"attrValueListLoading"}],attrs:{data:t.attrInfoForm.attrValueList,"element-loading-text":"数据正在加载......",border:"",fit:"","highlight-current-row":""}},[e("el-table-column",{attrs:{align:"center",label:"序号",width:"100"},scopedSlots:t._u([{key:"default",fn:function(a){return[t._v("\n            "+t._s(a.$index+1)+"\n          ")]}}])}),t._v(" "),e("el-table-column",{attrs:{label:"属性值id",width:"100"},scopedSlots:t._u([{key:"default",fn:function(a){return[t._v("\n            "+t._s(a.row.id)+"\n          ")]}}])}),t._v(" "),e("el-table-column",{attrs:{label:"属性值名称"},scopedSlots:t._u([{key:"default",fn:function(a){return[a.row.edit?e("el-input",{staticClass:"edit-input",attrs:{size:"mini"},on:{blur:function(e){t.saveAttrValue(a.row)}},nativeOn:{keyup:function(e){if(!("button"in e)&&t._k(e.keyCode,"enter",13,e.key,"Enter"))return null;t.saveAttrValue(a.row)}},model:{value:a.row.valueName,callback:function(e){t.$set(a.row,"valueName",e)},expression:"scope.row.valueName"}}):e("span",{on:{click:function(e){t.editAttrValue(a.row)}}},[t._v(t._s(a.row.valueName))])]}}])}),t._v(" "),e("el-table-column",{attrs:{label:"操作",width:"200",align:"center"},scopedSlots:t._u([{key:"default",fn:function(a){return[e("el-button",{attrs:{type:"danger",size:"mini",icon:"el-icon-edit"},on:{click:function(e){t.deleteAttrValueByName(a.row.valueName)}}},[t._v("删除")])]}}])})],1)],1),t._v(" "),e("div",{staticStyle:{"margin-top":"22px"}},[e("el-button",{attrs:{type:"primary",size:"mini"},on:{click:function(a){t.saveAttrInfo()}}},[t._v("保存")]),t._v(" "),e("el-button",{attrs:{type:"default",size:"mini"},on:{click:function(a){t.backToAttrList()}}},[t._v("返回")])],1)],1)],1)},[],!1,null,"1cba1680",null);i.options.__file="list.vue";a.default=i.exports},awwK:function(t,a,e){"use strict";var n=e("t3Un"),o=function(){return Object(n.a)({url:"getCatalog1",method:"post"})},l=function(t){return Object(n.a)({url:"getCatalog2?catalog1Id="+t,method:"post"})},i=function(t){return Object(n.a)({url:"getCatalog3?catalog2Id="+t,method:"post"})},r={data:function(){return{catalog1Id:null,catalog2Id:null,catalog3Id:null,catalogList1:[],catalogList2:[],catalogList3:[]}},created:function(){var t=this;o().then(function(a){t.catalogList1=a.data})},methods:{catalog1Changed:function(){var t=this;l(this.catalog1Id).then(function(a){t.catalog2Id=null,t.catalog3Id=null,t.catalogList2=a.data}),this.attrInfoList=null},catalog2Changed:function(){var t=this;i(this.catalog2Id).then(function(a){t.catalog3Id=null,t.catalogList3=a.data})},catalog3Changed:function(){this.$emit("listenOnSelect",this.catalog3Id)}}},s=e("KHd+"),c=Object(s.a)(r,function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("el-form",{staticClass:"demo-form-inline",attrs:{inline:!0}},[e("el-form-item",{attrs:{label:"一级分类"}},[e("el-select",{attrs:{placeholder:"请选择"},on:{change:t.catalog1Changed},model:{value:t.catalog1Id,callback:function(a){t.catalog1Id=a},expression:"catalog1Id"}},t._l(t.catalogList1,function(t){return e("el-option",{key:t.id,attrs:{label:t.name,value:t.id}})}))],1),t._v(" "),e("el-form-item",{attrs:{label:"二级分类"}},[e("el-select",{attrs:{placeholder:"请选择"},on:{change:t.catalog2Changed},model:{value:t.catalog2Id,callback:function(a){t.catalog2Id=a},expression:"catalog2Id"}},t._l(t.catalogList2,function(t){return e("el-option",{key:t.id,attrs:{label:t.name,value:t.id}})}))],1),t._v(" "),e("el-form-item",{attrs:{label:"三级分类"}},[e("el-select",{attrs:{placeholder:"请选择"},on:{change:t.catalog3Changed},model:{value:t.catalog3Id,callback:function(a){t.catalog3Id=a},expression:"catalog3Id"}},t._l(t.catalogList3,function(t){return e("el-option",{key:t.id,attrs:{label:t.name,value:t.id}})}))],1)],1)},[],!1,null,null,null);c.options.__file="CatalogSelector.vue";a.a=c.exports},f31X:function(t,a,e){"use strict";var n=e("lr1J");e.n(n).a},lr1J:function(t,a,e){},t3Un:function(t,a,e){"use strict";var n=e("vDqi"),o=e.n(n).a.create({baseURL:"http://localhost:8084",timeout:5e3});a.a=o}}]);