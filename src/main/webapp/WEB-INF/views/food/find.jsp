<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
p {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.a-link {
  cursor: pointer;
}
</style>
</head>
<body>
<!-- Breadcrumb Section Begin -->
  <section class="breadcrumb-section set-bg" data-setbg="/img/breadcrumb.jpg">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <div class="breadcrumb__text">
            <h2>맛집</h2>
            <div class="breadcrumb__option">
              <span>검색</span>>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <section class="product-details spad" id="food_find">
    <div class="container">
      <div class="row" style="margin: auto 0px">
        <input type="text" size="20" class="input-sm" placeholder="주소를 입력하세요" ref="addressRef" v-model="store.address">
        <button type="button" class="btn-sm btn-primary" @click="store.find(addressRef)">검색</button>
      </div>
      <div class="row" style="margin: 20px auto">
        <div class="col-md-3" v-for="(vo, idx) in store.food_list" :key="idx">
		  <div class="thumbnail">
		    <a :href="'detail_vue?fno=' + vo.fno">
		      <img :src="vo.poster" style="width: 250px; height: 180px">
		      <div class="caption">
		        <p>{{vo.name}}</p>
		      </div>
		    </a>
		  </div>
		</div>
      </div>
      <div class="row" style="justify-content: center">
        <div class="product__pagination blog__pagination">
          <a v-if="store.startPage > 1" class="a-link" @click="store.pageChange(store.startPage - 1)">&laquo;</a>
          <a v-for="i in store.range(store.startPage, store.endPage)" 
          	:class="store.curpage == i ? 'a-link active' : 'a-link'" @click="store.pageChange(i)">{{i}}</a>
          <a v-if="store.endPage < store.totalpage" class="a-link" @click="store.pageChange(store.endPage + 1)">&raquo;</a>
        </div>
      </div>
    </div>
  </section>
  <script src="/foodjs/foodStore.js"></script>
  <script>
    const { createApp, onMounted, ref } = Vue
    const { createPinia } = Pinia
    
    const app = createApp({
	  setup() {
		const store = useFoodStore()
		const addressRef = ref('')
		// useState('마포')
		
		onMounted(() => {
		  store.dataRecv()
		})
		
		return {
		  store,
		  addressRef
		}
	  }
    })
    app.use(createPinia())
    app.mount('#food_find')
  </script>
</body>
</html>